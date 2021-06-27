package yogiewisesa.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author (Yogie Wisesa)
 * @version (a version number or a date)
 * 
 * class jwork
 * sebagai driver class untuk program jwork
 * dan tempat pembuatan objek
 */

@SpringBootApplication
public class JWork
{
    public static void main(String[] args){

        // pembuatan objek lokasi recruiter
            Location l1 = new Location("DKI Jakarta", "Jakarta Utara", "Sunter");
        // pembuatan objek recruiter
            Recruiter r1 = new Recruiter(1, "yogie wisesa", "yogie.wisesa@ui.ac.id", "01234567889", l1);
        // memasukkan objek recrutier ke database
            DatabaseRecruiter.addRecruiter(r1);
        // membuat objek job baru
            Job job1 = new Job(1, "Developer", r1, 30000, JobCategory.UI);
            Job job2 = new Job(2, "Database", r1, 30000, JobCategory.BackEnd);
        // memasukkan objek job ke database
            DatabaseJob.addJob(job1);
            DatabaseJob.addJob(job2);
        /**
         * fungsi untuk menjalankan spring agar jwork menjadi server
         */
            SpringApplication.run(JWork.class, args);
    }
    
}
