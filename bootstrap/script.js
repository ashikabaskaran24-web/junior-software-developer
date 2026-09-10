document.getElementById("taskForm").addEventListener("submit", function(event) {

    event.preventDefault();

    // Get values
    let name = document.getElementById("name").value.trim();
    let description = document.getElementById("description").value.trim();
    let assignedTo = document.getElementById("assignedTo").value.trim();
    let dueDate = document.getElementById("dueDate").value;
    let status = document.getElementById("status").value;

    // Clear old errors
    document.getElementById("nameError").innerText = "";
    document.getElementById("descriptionError").innerText = "";
    document.getElementById("assignedToError").innerText = "";
    document.getElementById("dueDateError").innerText = "";
    document.getElementById("statusError").innerText = "";

    let valid = true;

    // Name validation
    if (name === "") {
        document.getElementById("nameError").innerText = "Name is required";
        valid = false;
    }

    // Description validation
    if (description === "") {
        document.getElementById("descriptionError").innerText =
            "Description is required";
        valid = false;
    }

    // Assigned To validation
    if (assignedTo === "") {
        document.getElementById("assignedToError").innerText =
            "Assigned To is required";
        valid = false;
    }

    // Due Date validation
    if (dueDate === "") {
        document.getElementById("dueDateError").innerText =
            "Due Date is required";
        valid = false;
    }

    // Status validation
    if (status === "") {
        document.getElementById("statusError").innerText =
            "Please select a status";
        valid = false;
    }

    // If everything is valid
    if (valid) {
        alert("Task added successfully!");
        document.getElementById("taskForm").reset();
    }
});
```
