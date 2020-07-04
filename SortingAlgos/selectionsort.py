def selection_sort(array):
    for i in range(0, len(array)):
        min_idx = i

        for j in range(i+1, len(array)):
            if array[j]<array[min_idx]:
                min_idx = j
        array[i], array[min_idx] = array[min_idx], array[i]













array = [4, 22, 41, 40, 27, 30, 36, 16, 42, 37, 14, 39, 3, 6, 34, 9, 21, 2, 29, 47]
selection_sort(array)
print("sorted array: " + str(array))
