t = gets.to_i
first = 0
second = 0
result = ""

(0...t).each do
    first, second = gets.split.map(&:to_i)
    result += "#{first + second}\n" 
end

puts result