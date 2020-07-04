import random


def partition(array, start, end):
  pivot_idx = random.randint(start, end)
  array[pivot_idx], array[start] = array[start], array[pivot_idx]
  pivot = array[start]

  low = start+1
  high = end

  while True:

    while low<=high and array[low] <= pivot:
      low+=1
    while low<=high and array[high] >= pivot:
      high-=1

    if low<=high:
      array[low], array[high] = array[high], array[low]
    else:
      break

  array[start], array[high] = array[high], array[start]

  return high

def quicksort(array, start, end):
  if start>=end:
    return

  p = partition(array, start, end)
  quicksort(array, start, p-1)
  quicksort(array, p+1, end)


array = [219,929,270,41,636,28,44,728,871,191,314,764,58,858,853,97,212,21,442]

quicksort(array, 0, len(array) - 1)
print(array)
