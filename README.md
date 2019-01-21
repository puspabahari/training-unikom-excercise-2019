# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?
    Hibernate ORM(Object Relation Mapping) berfungsi untuk memetakan sebuah objek ke dalam database.
    ORM sebagai jembatan penghubung antara objek yang dibuat dalam program dengan database,
    sehingga kita tidak perlu lagi menggunakan query SQL dalam melakukan manipulasi data di database
    karena objek yang dibuat dimapping sehingga ORM yang akan melakukan eksekusi ke dalam database.
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:
    - ```@Entity``` entity adalah kelas model domain yang berkorelasi dengan baris dalam database.
    - ```@Table```  @table annotation memungkinkan kita untuk menentukan detail dari tabel yang akan kita gunakan untuk mempertahankan entity dalam database.
    - ```@Column``` digunakan untuk menentukan detail dari kolom sebuah field atau property yang akan dipetakan.
    - ```@OneToOne``` pemetaan @OneToOne artinya yaitu satu baris dalam tabel dipetakan ke satu baris di tabel lain.
    - ```@ManyToOne``` pemetaan @ManyToOne artinya yaitu beberapa baris dalam tabel dipetakan ke satu baris di tabel lain.
    - ```@OneToMany``` pemetaan @OneToMany artinya yaitu satu baris dalam tabel dipetakan ke beberapa baris di tabel lain.
    - ```@JoinColumn```untuk membuat multiple join columns.
    - ```@JoinTable``` biasanya digunakan untuk pemetaan @OneToMany dan searah.
    - ```@GeneratedValue``` digunakan saat ketika kita ingin value dari primary key dibentuk secara otomatis.
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?
    Saat membuat aplikasi Java yang kompleks, kelas aplikasi harus dibuat se-independen mungkin dari kelas Java lainnya,
    agar kelas-kelas ini dapat digunakan kembali dan berguna juga di saat pengujian secara independen dari
    kelas-kelas lain saat melakukan pengujian unit.
    Dependency injection membantu dalam menempelkan kelas-kelas satu dengan lainnya dan pada saat yang sama menjaga independensinya.
4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?
    bertanggung jawab untuk membuat instance, mengkonfigurasi dan merakit objek yang disebut sebagai beans, serta mengelola siklus beans tersebut.
5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan``` Untuk mendeteksi secara otomatis kelas-kelas dan mendaftarkan beans yang sesuai, kita perlu menambahkan @ComponentScan ke kelas @Configuration kita.
    - ```@Autowired``` Perintah untuk Spring mencari beans dengan nama yang sama dengan property yang perlu diotomasi.
    - ```@Bean``` Beans adalah objek yang dipakai, dirakit, dan dikelola oleh Container Spring IoC. Dengan kata lain, bean hanyalah salah satu dari banyak objek dalam aplikasi kita.
    - ```@Component``` @Component digunakan untuk menunjukkan kelas sebagai Component. Ini berarti bahwa Spring akan mendeteksi secara otomatis kelas-kelas ini untuk Dependency injection ketika konfigurasi berbasis anotasi dan classpath scanning digunakan.
    - ```@Repository``` @Repositori adalah penanda untuk kelas apa pun yang memenuhi peran atau stereotip (juga dikenal sebagai Obyek Akses Data atau DAO) dari repositori.
    - ```@Service```    @Services menyimpan business logic dan metode panggilan di lapisan repositori.
    - ```@Controller``` menunjukkan bahwa kelas tertentu menjalankan peran sebagai controller.
    - ```@RestController```  @RestController adalah versi khusus dari Controller. Anotasi ini mengandung @Controller dan @ResponseBody dan sebagai hasilnya, menyederhanakan implementasi controller.
    - ```@RequestMapping```  Untuk mengonfigurasi mapping permintaan web, kita menggunakan anotasi @RequestMapping.
                             Anotasi @RequestMapping dapat diterapkan ke kelas dan / atau method di controller.
    - ```@GetMapping```  @GetMapping adalah anotasi tersusun yang bertindak sebagai shortcut untuk @RequestMapping (method = RequestMethod.GET).
    - ```@PostMapping``` @PostMapping adalah anotasi tersusun yang bertindak sebagai shortcut untuk @RequestMapping (method = RequestMethod.POST).
    - ```@PutMapping``` @PutMapping adalah anotasi tersusun yang bertindak sebagai shortcut untuk @RequestMapping (method = RequestMethod.PUT).
    - ```@DeleteMapping``` @DeleteMapping adalah anotasi tersusun yang bertindak sebagai shortcut untuk @RequestMapping (method = RequestMethod.DELETE).

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
