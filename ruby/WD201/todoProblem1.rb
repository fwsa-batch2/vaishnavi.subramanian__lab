require "date"

class Todo
  attr_accessor :text ,:date ,:completed
  def initialize(text , date , completed)
    @text = text
    @date = date
    @completed = completed
  end

  def to_displayable_string
    # FILL YOUR CODE HERE
  end

end

class TodosList

def initialize(todos)
    @todos = todos
end

def add (x)
  @todos.push(x)
end

def overdue?
    date=Date.today
    @date = @todos[:due_date]
    return(@date<date)? true : false
end

def due_today?
    date=Date.today
    @date = @todos[:due_date]
    return(@date==date)? true : false
end

def due_later?
    date=Date.today
    @date = @todos[:due_date]
    return(@date>date)? true : false
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
 todo-text =[]
 @todos.each do |x|
 ans = (x.completed)? "[X]" : "[]"
 todo-text.push("#{ans} #{x.text}  #{x.date}")
 return todo-text
 end

end

date = Date.today
todos = [
  { text: "Submit assignment", due_date: date - 1, completed: false },
  { text: "Pay rent", due_date: date, completed: true },
  { text: "File taxes", due_date: date + 1, completed: false },
  { text: "Call Acme Corp.", due_date: date + 1, completed: false },
]

# todos = todos.map { |todo|
#   Todo.new(todo[:text], todo[:due_date], todo[:completed])
# }

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
end
