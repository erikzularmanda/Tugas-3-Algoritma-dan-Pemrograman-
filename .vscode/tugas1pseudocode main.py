golongan = input("Masukkan golongan karyawan (A/B/C): ").upper()
if golongan == "A":
    gaji_pokok = 5000000
elif golongan == "B":
    gaji_pokok = 6500000
elif golongan == "C":
    gaji_pokok = 9500000
else:
    print("Golongan tidak valid.")
    exit()

jam_lembur = int(input("Masukkan jumlah jam lembur: "))

# Menentukan persentase lembur
if jam_lembur == 1:
    persentase_lembur = 0.30
elif jam_lembur == 2:
    persentase_lembur = 0.32
elif jam_lembur == 3:
    persentase_lembur = 0.34
elif jam_lembur == 4:
    persentase_lembur = 0.36
elif jam_lembur >= 5:
    persentase_lembur = 0.38
else:
    persentase_lembur = 0

# menghitung gaji lembur
gaji_lembur = int(gaji_pokok * persentase_lembur)

# menghitung total penghasilan
total_penghasilan = int(gaji_pokok) + int(gaji_lembur)

# output
print("Gaji Pokok: Rp", format(gaji_pokok, ",").replace(",", "."))
print("Gaji Lembur: Rp", format(gaji_lembur, ",").replace(",", "."))
print("Total Penghasilan: Rp", format(total_penghasilan, ",").replace(",", "."))