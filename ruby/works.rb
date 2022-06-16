print "Good morning all".split
puts
print "Happy morning all".split("")
puts

# to capitalize the first letter of sentence
puts "good to see you".capitalize

# to print each value (for each loop)
names = ["Hasanna","Meen","Vaishu"]
names.select {|n| puts n}

puts

# to get odd numbers
number = [1,2,3,4,5,6,7,8,9,10]
odd_number = number.select{|odd| odd.odd?}
puts odd_number

#Arrays
first_names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
first_names.each do|i|
  print i.join(" ")
  puts
end
