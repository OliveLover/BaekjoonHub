x, y = 2.times.map { gets.chomp.to_i }
quadrant = 0

if x > 0 && y > 0
    quadrant = 1
elsif x < 0 && y > 0
    quadrant = 2
elsif x < 0 && y < 0
    quadrant = 3
else
    quadrant = 4
end

puts quadrant