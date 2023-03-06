import collections
from collections import Counter
c = Counter(cats=4, dogs=7)
print (list(c.elements()))
print (c.most_common(1))

d = Counter(a=4, b=2, c=0, d=-2)
e = Counter(['a', 'b', 'b', 'c'])

print (d+e)
print (d-e)
print (d&e)
print (d|e)