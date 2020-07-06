def binary_search(array, value):
    if not array:
        return Flase
    if len(array)==1:
        return value==array[0]

    low, high = 0, len(array)
    while low<=high:
        mid = low+(high-low)//2
        if array[mid]==value:
            return "Value found at index " + str(mid)
        elif array[mid]>value:
            high = mid-1
        else:
            low = mid+1
    print("Value not found in array")
    return False



print(binary_search([3,6,12,44,76,93,101,243,290,476,512], 76))
print("Yes")
