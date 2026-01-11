a, b = gets.split.map(&:to_i)
answer = ""

answer += (a + b).to_s + "\n"
answer += (a - b).to_s + "\n"
answer += (a * b).to_s + "\n"
answer += (a / b).to_s + "\n"
answer += (a % b).to_s

puts answer