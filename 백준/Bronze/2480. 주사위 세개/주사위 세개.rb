resultCount = Array.new(7, 0)
readLine = gets.split.map(&:to_i)

readLine.each do |number|
    resultCount[number] += 1
end

maxCount = resultCount.max
maxNum = resultCount.rindex { |x| x > 0 }
manyNum = resultCount.index(maxCount)
awards = 0

if maxCount == 1
    awards = maxNum * 100
elsif maxCount == 2
    awards = 1000 + manyNum * 100
else
    awards = 10000 + maxNum * 1000
end

puts awards