# A program to implement insertionSort

def insertionSort(array):
  for index in range(1, len(array)):
    value = array[index]
    position = index


    while position > 0 and array[position - 1] > value:
      array[position] = array[position - 1]
      position -=1

    array[position] = value



array = [4, 22, 41, 40, 27, 30, 36, 16, 42, 37, 14, 39, 3, 6, 34, 9, 21, 2, 29, 47]
insertionSort(array)
print("sorted array: " + str(array))
