package com.example.taskmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


// =====================================================
// MAIN SPRING BOOT APPLICATION
// =====================================================

@SpringBootApplication
public class TaskManagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                TaskManagerApplication.class,
                args
        );

    }
}


// =====================================================
// TASK ENTITY
// =====================================================

@Entity
class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Name is required")
    private String name;


    @NotBlank(message = "Description is required")
    private String description;


    @NotBlank(message = "Assigned To is required")
    private String assignedTo;


    @NotBlank(message = "Due Date is required")
    private String dueDate;


    @NotBlank(message = "Status is required")
    private String status;


    // Default constructor
    public Task() {
    }


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }


    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


// =====================================================
// REPOSITORY
// =====================================================

interface TaskRepository extends JpaRepository<Task, Long> {

}


// =====================================================
// REST CONTROLLER
// =====================================================

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
class TaskController {


    private final TaskRepository repository;


    // Constructor
    public TaskController(TaskRepository repository) {

        this.repository = repository;

    }


    // =================================================
    // GET ALL TASKS
    // =================================================

    @GetMapping
    public List<Task> getAllTasks() {

        return repository.findAll();

    }


    // =================================================
    // GET TASK BY ID
    // =================================================

    @GetMapping("/{id}")
    public ResponseEntity<?> getTaskById(
            @PathVariable Long id) {

        Optional<Task> task =
                repository.findById(id);


        if (task.isPresent()) {

            return ResponseEntity.ok(
                    task.get()
            );

        }


        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Task not found with ID: " + id);
    }


    // =================================================
    // CREATE TASK
    // =================================================

    @PostMapping
    public ResponseEntity<Task> createTask(
            @Valid @RequestBody Task task) {


        Task savedTask =
                repository.save(task);


        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedTask);
    }


    // =================================================
    // UPDATE TASK
    // =================================================

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTask(
            @PathVariable Long id,
            @Valid @RequestBody Task newTask) {


        Optional<Task> optionalTask =
                repository.findById(id);


        if (optionalTask.isEmpty()) {

            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Task not found with ID: " + id);

        }


        Task task = optionalTask.get();


        task.setName(
                newTask.getName()
        );


        task.setDescription(
                newTask.getDescription()
        );


        task.setAssignedTo(
                newTask.getAssignedTo()
        );


        task.setDueDate(
                newTask.getDueDate()
        );


        task.setStatus(
                newTask.getStatus()
        );


        Task updatedTask =
                repository.save(task);


        return ResponseEntity.ok(
                updatedTask
        );
    }


    // =================================================
    // DELETE TASK
    // =================================================

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(
            @PathVariable Long id) {


        if (!repository.existsById(id)) {

            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Task not found with ID: " + id);

        }


        repository.deleteById(id);


        return ResponseEntity.ok(
                "Task deleted successfully"
        );
    }


    // =================================================
    // ASSIGN TASK
    // =================================================

    @PutMapping("/{id}/assign")
    public ResponseEntity<?> assignTask(
            @PathVariable Long id,
            @RequestParam String person) {


        Optional<Task> optionalTask =
                repository.findById(id);


        if (optionalTask.isEmpty()) {

            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Task not found with ID: " + id);

        }


        Task task = optionalTask.get();


        task.setAssignedTo(person);


        Task updatedTask =
                repository.save(task);


        return ResponseEntity.ok(
                updatedTask
        );
    }
}


// =====================================================
// GLOBAL EXCEPTION HANDLER
// =====================================================

@RestControllerAdvice
class GlobalExceptionHandler {


    // =================================================
    // 400 VALIDATION ERROR
    // =================================================

    @ExceptionHandler(
            MethodArgumentNotValidException.class
    )
    public ResponseEntity<Map<String, String>>
    handleValidation(
            MethodArgumentNotValidException exception) {


        Map<String, String> errors =
                new HashMap<>();


        exception.getBindingResult()
                .getFieldErrors()
                .forEach(error -> {

                    errors.put(
                            error.getField(),
                            error.getDefaultMessage()
                    );

                });


        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errors);
    }


    // =================================================
    // 500 SERVER ERROR
    // =================================================

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String>
    handleException(Exception exception) {


        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(
                    "Internal server error: "
                    + exception.getMessage()
                );
    }
}
