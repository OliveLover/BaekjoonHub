h, m = gets.split.map(&:to_i)
ealry = 45

m -= 45

if m < 0
    h -= 1
    m += 60

    if h < 0
        h += 24
    end
end

puts "#{h} #{m}"