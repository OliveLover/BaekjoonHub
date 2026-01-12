a, b, c = gets.split.map(&:to_i)

answer = ""
answer += ((a + b) % c).to_s + "\n"
answer += (((a % c) + (b % c)) % c).to_s + "\n"
answer += ((a * b) % c).to_s + "\n"
answer += (((a % c) * (b % c)) % c).to_s + "\n"

puts answer