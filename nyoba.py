"""
print("PROGRAM BIODATA")

nim=input("masukan nim: ")
nama=input("masukan nama: ")
kelas=input("masukan kelas: ")


print("NIM      : ",nim)
print("Nama     : ",nama)
print("Kelas    : ",kelas)

"""
"""
print("PROGRAM PENGHITUNG TOTAL PENJUALAN")

kode=str(input("Masukan kode transaksi: "))
nama=str(input("Nama barang : "))
harga=int(input("Harga barang : "))
jumlah=int(input ("Jumlah barang: "))

total=harga*jumlah

print("total: ",total)

"""

harga=int(input("Masukan harga: "))
jumlah=int(input("Masukan jumlah: "))

total=harga*jumlah
pajak=total*0.1


if jumlah >= 5:
    potongan= total*0.5
else :
    potongan= 0  

grand_total= (total+pajak)-potongan
print(total)
print(pajak) 
print(grand_total)
