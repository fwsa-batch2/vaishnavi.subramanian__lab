todos = [
  ["Send invoice", "money"],
  ["Clean room", "organize"],
  ["Pay rent", "money"],
  ["Arrange books", "organize"],
  ["Pay taxes", "money"],
  ["Buy groceries", "food"]
]

do_money = []
do_organize = []
do_food = []

for i in 0...todos.length do
  data = todos[i][1]
  if data == "money"
    do_money.push(todos[i][0])
  elsif data == "organize"
    do_organize.push(todos[i][0])
  elsif data == "food"
    do_food.push(todos[i][0])
  end
end

hash = {:money => do_money, :organize => do_organize, :food => do_food}
puts hash
