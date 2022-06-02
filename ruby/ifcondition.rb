age = gets.chomp.to_i
if age > 18
    puts "You are eligible to vote"
elsif age <= 0
    puts "Give valid age"
else 
    puts "YOu are not eligible to vote"
end

