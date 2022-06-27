require "date"
class Todo
  attr_accessor :text, :date, :completed
  def initialize(todo_text,todo_date,todo_completed)
    @text = todo_text
    @date = todo_date
    @completed = todo_completed
  end
  def overdue?
    current_date = Date.today
    return (@date<current_date)? true : false
  end
  def due_today?
    current_date = Date.today
    return (@date==current_date)? true : false
  end
  def due_later?
    current_date = Date.today
    return (@date>current_date)? true : false
  end
  def to_displayable_string
    ans = (@ans)? "[X]" : "[]"
    return "#{ans} #{@text} #{@date}"
  end
end

class TodosList
  def initialize(todos)
    @todos = todos
  end

  def add (x)
    @todos.push(x)
  end

  def overdue
    TodosList.new(@todos.filter { |todo| todo.overdue? })
  end
  def due_today
    TodosList.new(@todos.filter { |todo| todo.due_today? })
  end
  def due_later
    TodosList.new(@todos.filter { |todo| todo.due_later? })
  end

  def to_displayable_list
    todo_text=[]
    @todos.each do |x|
    date = Date.today
    if x.date == date
      todo_text.push("#{x.to_displayable_string}")
    else
      todo_text.push("#{x.to_displayable_string}")
    end
    end
   return todo_text
  end
end

date = Date.today

todos = [
  { text: "Submit assignment", due_date: date - 1, completed: false },
  { text: "Pay rent", due_date: date, completed: true },
  { text: "File taxes", due_date: date + 1, completed: true },
  { text: "Call Acme Corp.", due_date: date + 1, completed: true },
]

todos = todos.map { |todo|
  Todo.new(todo[:text], todo[:due_date], todo[:completed])
}

todos_list = TodosList.new(todos)

todos_list.add(Todo.new("Service vehicle", date, false))

puts "My Todo-list\n\n"

puts "Overdue\n"
puts todos_list.overdue.to_displayable_list
puts "\n\n"

puts "Due Today\n"
puts todos_list.due_today.to_displayable_list
puts "\n\n"

puts "Due Later\n"
puts todos_list.due_later.to_displayable_list
puts "\n\n"
