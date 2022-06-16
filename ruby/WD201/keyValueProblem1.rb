books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

output = {}
for i in 0...authors.length do
  each_author = authors[i]
  each_author = each_author.split(" ")
  each_author = each_author[0]
  each_author = each_author.downcase.to_sym

  each_book = books[i]
  output[each_author] = [each_book]
end
puts output
