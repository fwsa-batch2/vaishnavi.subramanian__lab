# for loop
names = ["Vaishu","Meenu","Ismail"]
for i in names do
    puts i
end 

# while
number = gets.chomp.to_i
while number >= 0 
    puts number
    number -= 1
end

# do while
loop do
    puts "Question : 2+3 = ?"
    print "Type your answer : "
    a = gets.chomp.to_i
    if a == 5 
        puts "Correct Answer !"
    break
    else 
        puts "Wrong answer. Try again"
    end
end

# until loop

i = 4

until i==10 do
    puts "the value of i is #{i}"
    i = i + 1
end

