hours, minutes = gets.split.map(&:to_i)
timer = gets.to_i
addHours = 0
addMinutes = 0

addHours += (timer / 60)
addMinutes += (timer % 60)

hours += addHours
minutes += addMinutes

if minutes >= 60
    hours += 1
    minutes %= 60
end

if hours >= 24
    hours %= 24
end

puts "#{hours} #{minutes}"