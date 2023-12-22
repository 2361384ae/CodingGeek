import math

a = int(input('Number A: '))
b = int(input('Number B: '))
c = int(input('Number C: '))

delta = (b ** 2) - (4 * a * c)

if delta > 0:
    x1 = (-b + math.sqrt(delta)) / (2 * a)
    x2 = (-b - math.sqrt(delta)) / (2 * a)
    print(f'x1 is {x1} and x2 is {x2}.')
    print('Delta is',delta)
elif delta == 0:
    x1 = -b / (2 * a)
    print(f'x1 is {x1}.')
    print('The delta is {}'.format(delta))
else:
    print('The delta is %d'%(delta))
    print('delta is negative!')