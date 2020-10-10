def dec_to_bin(num):
  arr = []
  while abs(num):
    arr.append(str(num%2))
    num = num //2

  res = ''.join(ch for ch in arr[::-1])

  return res



print(dec_to_bin(29050))


def bin_to_dec(num):
  num = str(num)
  summ = 0

  for idx, ch in enumerate(num[::-1]):
    summ += (int(ch)* (2**idx))

  return summ


print(bin_to_dec('0100111000100001'))
print(bin_to_dec('1101001010110011'))




