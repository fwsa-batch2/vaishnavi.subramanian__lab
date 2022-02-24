let taskList = [];

function submitHandler() {
    event.preventDefault();

    let newTask = document.getElementById("input-1").value;
    taskList.push(newTask);
    console.log(taskList);


    localStorage.setItem("Tasks", taskList);

    let taskLength = taskList.length;

    let task_1 = "";
    for (i = 0; i < taskLength; i++) {
        let task = taskList[i];
        let addTask = "<li>" + task + "</li>";
        task_1 = task_1 + addTask;
    }

    let ulTag = document.getElementById("ul");
    ulTag.innerHTML = task_1;
}