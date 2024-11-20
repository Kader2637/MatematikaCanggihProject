# Matematika Canggih

Proyek ini adalah aplikasi sederhana yang memungkinkan pengguna untuk melakukan operasi matematika dasar seperti pertambahan, pengurangan, dan modulus. Aplikasi ini menggunakan konsep pemrograman berorientasi objek dengan pewarisan, di mana kelas dasar `Matematika` menyediakan metode dasar, dan kelas turunan `MatematikaCanggih` menambahkan logika untuk memilih operasi yang diinginkan.

## Fitur

### Kelas dasar `Matematika`:
- Menyediakan metode untuk:
  - **Pertambahan**: Menjumlahkan dua angka.
  - **Pengurangan**: Mengurangkan satu angka dari angka lainnya.

### Kelas turunan `MatematikaCanggih`:
- Menambahkan metode untuk:
  - **Modulus**: Menghitung sisa hasil bagi dari dua angka, dengan penanganan untuk kasus di mana pembagi adalah 0.
  - **Pilihan**: Menyediakan antarmuka bagi pengguna untuk memilih operasi yang diinginkan.
  - **Metode `getpilihan`**: Menangani logika untuk menjalankan operasi berdasarkan input pilihan pengguna.

## Kelas `MatematikaCanggihBeraksi`

Kelas ini berfungsi sebagai titik masuk aplikasi. Pengguna dapat:
1. Memilih jenis operasi yang ingin dilakukan.
2. Memasukkan angka yang diperlukan.
3. Melihat hasil dari operasi yang dipilih.

## Cara Menggunakan

1. Jalankan program.
2. Pilih jenis operasi yang ingin dilakukan:
   - Pengurangan
   - Pertambahan
   - Modulus
3. Masukkan angka yang diperlukan.
4. Program akan menampilkan hasil dari operasi yang dipilih.

## Instalasi

Clone repository ini dan jalankan menggunakan IDE Java atau compiler Java favorit Anda:

```bash
git clone https://github.com/Kader2637/MatematikaCanggihProject.git
