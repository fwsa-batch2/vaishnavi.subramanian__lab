def case_practice
    print "Enter your mark : "
 entered_mark = gets.chomp.to_i
    case entered_mark
    when 80..100
        puts "#{entered_mark} is First class."
    when 60...80
        puts "#{entered_mark} is Second class."
    when 40...70
        puts "#{entered_mark} is average."
    when 0...40
        puts "#{entered_mark} is fail mark."
    else
        puts "#{entered_mark} is invalid mark. Please enter valid one."
    end
end
case_practice