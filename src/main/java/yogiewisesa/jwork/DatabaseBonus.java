/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class Database bonus
 * untuk menyimpan bonus di arraylist
 */
package yogiewisesa.jwork;
import java.util.ArrayList;

public class DatabaseBonus {

    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    /**
     * getter database bonus
     * @return seluruh database bonus
     */
    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    /**
     * getter id bonus terakhir
     * @return id terakhir
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * getter bonus berdasarkan id
     * @param id
     * @return bonus dengan id tersebut
     * @throws BonusNotFoundException
     */
    public static Bonus getBonusById(int id) throws BonusNotFoundException{
        Bonus dummy = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                dummy = bonus;
                return dummy;
            }
        }
        throw new BonusNotFoundException(dummy);
    }

    /**
     * method getter bonus menggunkaan referral code
     * @param referralCode
     * @return bonus dengan referral code tersebut
     */
    public static Bonus getBonusByReferralCode(String referralCode) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getReferralCode().equals(referralCode)) {
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }

    /**
     * method untuk menambahkan bonus baru
     * @param bonus
     * @return true jika berhasil ditambah
     * @throws ReferralCodeAlreadyExistsException jika gagal menambahkan
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException{
        for (Bonus cekbonus : BONUS_DATABASE)
        {
            if (bonus.getReferralCode().equals(cekbonus.getReferralCode()))
            {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    /**
     * method untuk mengaktifkan bonus
     * @param id
     * @return true jika aktif, false jika tidak aktif
     */
    public static boolean activateBonus(int id) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }

    /**
     * method untuk menonaktifkan bonus
     * @param id
     * @return true jika tidak aktif, false jika aktif
     */
    public static boolean deactivateBonus(int id) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(false);
                return true;
            }
        }
        return false;
    }

    /**
     * method untuk menghapus bonus dengan id
     * @param id
     * @return true jika berhasil terhapus
     * @throws BonusNotFoundException jika bonus tidak ditemukan
     */
    public static boolean removeBonus(int id) throws BonusNotFoundException{
        for (Bonus bonus : BONUS_DATABASE)
        {
            if (bonus.getId() == id)
            {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        throw new BonusNotFoundException(getBonusById(id));
    }

}