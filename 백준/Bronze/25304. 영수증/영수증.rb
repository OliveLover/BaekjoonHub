x = gets.to_i
n = gets.to_i
a = 0
b = 0

n.times do
    a, b = gets.split.map(&:to_i)

    x -= a * b
end

puts x == 0 ? "Yes" : "No"