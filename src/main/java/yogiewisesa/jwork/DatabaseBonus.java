package yogiewisesa.jwork;
import java.util.ArrayList;

public class DatabaseBonus {

    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException{
        Bonus dummy = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                dummy = bonus;
            } else {
                return dummy;
            }
        }
        throw new BonusNotFoundException(dummy);
    }

    public static Bonus getBonusByReferralCode(String referralCode) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getReferralCode().equals(referralCode)) {
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }

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

    public static boolean activateBonus(int id) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean deactivateBonus(int id) {
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(false);
                return true;
            }
        }
        return false;
    }

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