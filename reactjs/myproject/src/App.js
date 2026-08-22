import React from 'react'
function App() {
  const dis1=()=>{
         var tag=document.getElementsByTagName("input")
         var size=tag.length;
         var sum=0;
         document.getElementById("res").innerHTML=size;
         for(var i=0;i<size;i++)
         {
          sum=sum+parseInt(tag[i].value)
         }
          document.getElementById("res1").innerHTML=sum;
  }
  return (
    <div>
        <h1>forms</h1>
        <input type="number"placeholder='num'></input><br></br>
        <input type="number"placeholder='num'></input><br></br>
        <input type="number"placeholder='num'></input><br></br>
        <button onClick={dis1} id="tot">total</button>
        <p id="res"></p>
        <p id="res1"></p>
        </div>
        )
        }
        export default App

// import React from 'react'
// function App() {
//   const dis1=(Event)=>{
//          document.getElementById("res").innerHTML="working with:"+Event.target.type;
//   }
//   return (
//       <form>
//         <h1>forms</h1>
//         <input type="text"placeholder='2'></input><br></br>
//         <input type="password"id="t2"placeholder='password'></input><br></br>
//         <input type="number"id="t3"placeholder='num'></input><br></br>
//         <label>select gender</label>
//         <input type="radio"id="t4"2="gen"></input>male
//         <input type="radio"id="t5"2="gen"></input>female<br></br>
//         <div id="res"></div>
//         </form>
//         )}
// export default App
// import React from 'react'
// function App() {
//   const dis1 = (event) => {
//     document.getElementById("res").innerHTML =
//       event.target.id + " : " + event.target.value
//   }

//   return (
//     <div>
//       <h1>React Events</h1>

//       <input
//         type="text"
//         id="text1"
//         
//         placeholder="Enter text"
//       />
//       <br></br>

//       <input
//         type="text"
//         id="text2"
//         
//         placeholder="Enter text"
//       />
//       <br></br>

//       <div id="res"></div>
//     </div>
//   )
// }

// export default App
// import React from 'react'
// function App() {
//   const dis1 = () => {
//     var a=parseInt(document.getElementById("t1").value)
//     var b=parseInt(document.getElementById("t2").value)
//     var c=a+b;
//     document.getElementById("res").innerHTML="total"+c
//   }
//   return (
//     <div>
//       <h1>react events</h1>

//       <input type="text" id="t1"  placeholder="enter text"/><br></br>
//         <input type="text" id="t2" placeholder="enter text"/><br></br>
//         <input type="button"id="but"onClick={dis1}value="total"></input>
//       <div id="res"></div>
//     </div>
//   )
// }
// export default App
// function App() {
//   const dis1 = () => {
//     document.getElementById("res").innerHTML = "outside"
//     document.getElementById("t1").style.backgroundColor = "red"
//   }

//   const dis2 = () => {
//     document.getElementById("res").innerHTML = "inside"
//     document.getElementById("t1").style.backgroundColor = "green"
//   }

//   return (
//     <div>
//       <h1>react events</h1>

//       <input
//         type="text"
//         id="t1"
//         onBlur={dis1}
//         onFocus={dis2}
//         placeholder="enter text"
//       />

//       <div id="res"></div>
//     </div>
//   )
// }

// export default App
// import React from 'react'
// function App() {
//   return (
//       <form>
//         <h1>forms</h1>
//         <input type="text"id="t1"placeholder='2'></input><br></br>
//         <input type="password"id="t2"placeholder='password'></input><br></br>
//         <input type="number"id="t3"placeholder='num'></input><br></br>
//         <label>select gender</label>
//         <input type="radio"id="t4"2="gen"></input>male
//         <input type="radio"id="t5"2="gen"></input>female<br></br>
//         <label>select date,time</label>
//         <input type="date"id="dat"></input>
//         <input type="time"id="tim"></input><br></br>
//         <input type="color"></input>select color<br></br>
//         <label>course:</label>
//         <input type="checkbox"id="co1"></input>c
//         <input type="checkbox"id="co2"></input>python
//         <input type="checkbox"id="co3"></input>java

//       </form>
//   )
// }
// export default App

// import React from 'react'
// function App(props) {
//   var arr=[];
//   for(var k in props.data)
//   {
//     arr.push(k)
//   }
//   return (
//     <div>
//           {arr.map((v) => <><br></br>{props.data[v]}</>)}
//     </div>
//   )
// }
// export default App
// import React from 'react'
// function App(props) {
//   var arr=[];
//   for(var k in props.data)
//   {
//     arr.push(k)
//   }
//   return (
//     <div>
//        {arr.map((v)=><h1>{v}---{(props.data[v]===true&&"eligible")||(props.data[v]===false&&"noteligible")||props.data[v]}</h1>)}
//       </div>
//   )
// }
// export default App */
// import React from 'react'
// function App(props) {
//   return (
//     <div>
//       <h1>{props.data.rno}</h1>
//       <h1>{props.data.iseligible?"eligible":"not eligible"}</h1>
//     </div>
//   )
// }

// export default App

// import React from 'react'
// function App(props) {
//   return (
//     <div>
//       <h1>properties shared data from one components to another components</h1>
//       <h6>{props.data[0]}</h6>
//       {props.data.map((v,index)=><><br></br>mark:{index+1}={v} </>)}
//     </div>
//   )
// }export default App
// import React from 'react'
// function App(props) {
//   return (
//     <div>
//       <h1>properties shared data from one components to another components</h1>
//       <h1>your 2:{props.data}</h1>
//     </div>
//   )
// }export default App

// import React from 'react'
// function App()
// {
//   var stud={
//     sno:14,
//     s2:'ashi',
//     marks:{tamil:90,english:99},
//     result:"pass"
//   }
//   return(
//     <div>
//       <h1>JSON</h1>
//       <h1>student rno:{stud.sno}</h1>
//       <h1>student rno:{stud.s2}</h1>
//       <h1>student tamil:{stud.marks["tamil"]}</h1>
//       <h1>student english:{stud.marks.english}</h1>
//       <h1>student rno:{stud.result}</h1>
//     </div>
//   )
// }
// export default App
// import React from 'react'
// function App()
// {
//   var stud={
//     sno:14,
//     s2:'ashi',
//     mark:90,
//     result:"pass"
//   }
//   return(
//     <div>
//       <h1>JSON</h1>
//       <h1>student rno:{stud.sno}</h1>
//       <h1>student rno:{stud.s2}</h1>
//       <h1>student rno:{stud.mark}</h1>
//       <h1>student rno:{stud.result}</h1>
//     </div>
//   )
// }
// export default App
// import React from 'react'
// function App() {
//   var arr = [11,22,33,44,55];
//   var big =arr[0];
//   return (
//     <div>
//       {arr.map((v)=><>{big<v && <>{big=v}</>}</>)}
//       <h1>{big}</h1>
//     </div> //ithu theriya kutathuna div style ={{display:"none"}}
//   )
// }
// export default App
// import React from "react";
// function App()
// {
//   var arr=[10,20,30,40,50]
//   return(
//     <div style={{display:"none"}}>
//        {arr.map((item)=><></>item)}
//     </div>
//   )
// }
// import React from "react";
// function App()
// {
//   var arr=[10,20,30,40,50]
//   return(
//     <div>
//       <h1>array</h1>
//        {arr.map((item)=>item)}
//        <br></br>
//         {arr.map((item)=><><br></br>{item},</>)}
//         <ol type="A">
//           {arr.map((item)=><li>{item}</li>)}
//         </ol>
//     </div>
//   )
// }
// export default App
//  function App()
// {
//   var arr=[10,20,30,40,50,6-0]
//   return (
//     <div>
//         <h1>{arr[0]}</h1>
//         <h1>{arr[1]}</h1>
//         <h1>{arr[2]}</h1>
//         <h1>{arr[3]}</h1>
//     </div>
//   )
// }
// export default App
// function App()
// {
//   var avg=65
//   var res="fail"
//   return (
//     <div>
//       <h1>average:{avg}</h1>
//         <h1>{(res==="pass" &&((avg>=85 && "outstanding")||(avg>=75 && "excellent")||(avg>=65 &&"very good")||(avg>=55&&"good")||"fair"))||"no grade"}</h1>
//     </div>
//   )
// }
// import React from 'react'
// function App()
// {
//   var avg=65
//   return (
//     <div>
//       <h1>average:{avg}</h1>
//         <h1>{avg} is {(avg>=85 && "outstanding")||(avg>=75 && "excellent")||(avg>=65 &&"very good")||(avg>=55&&"good")||"fair"}</h1>
//     </div>
//   )
// }
// import React from 'react'
// function App()
// {
//   var m1=0
//   return (
//     <div>
//       <h1>number:{m1}</h1>
//         <h1>{m1} is {(m1===0 && " zero")||(m1>0 && "positive")||"negative"}</h1>
//     </div>
//   )
// }
// export default App
// import React from 'react'
// function App()
// {
//   var m1=2004
//   return (
//     <div>
//       <h1>number:{m1}</h1>
//         <h1>{m1} is {m1%4===0 && " leap year"||"not leap"}</h1>
//     </div>
//   )
// }
// export default App
// import React from 'react'
// function App()
// {
//   var m1=40
//   var m2=20;
//   return (
//     <div>
//         <h1>{m1>m2 && m1||"m2 is big"}</h1>
//     </div>
//   )
// }
// export default App
// import React from 'react'
// function App()
// {
//   var mark=60
//   return (
//     <div>
//         <h1>ifelse</h1> */}
//         <h1>mark:{mark}</h1>
//         <h1>{(mark>34 && "pass")||"fail"}</h1>
//     </div>
//   )
// }
// export default App
// import React from 'react'
// function App()
// {
//   var mark=10
//   return (
//     <div>
//         <h1>mark:{mark}</h1>
//         <h1>{mark>34 && "pass"}</h1>
//         <h1>{mark<=34 && "fail"}</h1>
//     </div>
//   )
// }
// export default App
/*import './App.css'
import React from 'react'
import myimg from './imagesreact/dog.jpg'
function App() {
  return (
    <div>
      <img src={myimg} width="90%" alt="not found"></img>
    </div>
  )
}
export default App
/*var App=()=>{
  var a=10
  var b=20
  var c=10
  return(
    <>
    <h1>a:{a}</h1>
    <h1>b:{b}</h1>
    <h1>c:{c}</h1>
    <h1>tot:{a+b+c}</h1>
    </>
  )
}
export default App;
/*import React from "react";
class App extends React.Component
{
  render(){
    return(
      <>
    <h1>welcome to react js</h1>
     <h2>welcome to react js</h2>
      <h3>welcome to react js</h3>
      </>
    )
  }
}
export default App;
/*function App()
{
  return(
    <>
    <h1>welcome to react js</h1>
     <h2>welcome to react js</h2>
      <h3>welcome to react js</h3>
      </>
  )
}
export default App;
/*import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div class2="App">
      <header class2="App-header">
        <img src={logo} class2="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          class2="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;*/
