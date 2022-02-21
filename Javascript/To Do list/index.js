let taskList = [];

function submitHandler() {
    event.preventDefault(); // to prevent page from reloading

    // get value from input field
    const newTask = document.getElementById("newTask").value;
    // console.log(newTask);

    // push the value inside the array
    taskList.push(newTask);
    console.log(taskList);

    const taskListInString = JSON.stringify(taskList);
    localStorage.setItem("taskList", taskListInString);
    // sessionStorage.setItem("taskList", taskListInString);

    renderList();
}

function renderList() {
    const tasksInString = localStorage.getItem("taskList");
    // const tasksInString = sessionStorage.getItem("taskList");
    const tasksInArray = JSON.parse(tasksInString);

    const noOfTask = tasksInArray.length;
    console.log(noOfTask);

    let tasks = "";
    for (i = 0; i < noOfTask; i++) {
        const _task = tasksInArray[i];
        let newTask = " <li class='list-group-item'> " + _task + " </li> ";
        tasks = tasks + newTask;
    }

    const ulTag = document.getElementById("taskLists");
    ulTag.innerHTML = tasks;
}

renderList();