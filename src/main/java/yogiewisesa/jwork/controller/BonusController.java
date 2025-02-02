/**
 * @author Yogie Wisesa
 * @version 24/6/21
 * 
 * class Bonus controller
 */
package yogiewisesa.jwork.controller;

import org.springframework.web.bind.annotation.*;
import yogiewisesa.jwork.*;

import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController
public class BonusController {

    /**
     * method getter untuk semua bonus
     * @return bonus
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus(){
        ArrayList<Bonus> bonus = null;
        bonus = DatabaseBonus.getBonusDatabase();
        return bonus;
    }

    /**
     * getter bonus menggunakan referral code
     * @param referralCode code referral untuk mencari bonus
     * @return bonus yang didapat
     */
    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode){
        Bonus bonus = null;
        bonus = DatabaseBonus.getBonusByReferralCode(referralCode);
        return bonus;
    }

    /**
     * method menambahkan kode bonus baru
     * @param referralCode 
     * @param extraFee tambahan gaji
     * @param minTotalFee minimum gaji
     * @param active status kode bonus
     * @return bonus yang baru dibuat
     * @throws ReferralCodeAlreadyExistsException
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value = "referralCode") String referralCode,
                          @RequestParam(value = "extraFee") int extraFee,
                          @RequestParam(value = "minTotalFee") int minTotalFee,
                          @RequestParam(value = "active") boolean active)
            throws ReferralCodeAlreadyExistsException
        {
            Bonus bonus = new Bonus(DatabaseBonus.getLastId()+1, referralCode, extraFee, minTotalFee, active);
            try {
                DatabaseBonus.addBonus(bonus);
                return bonus;
            } catch (ReferralCodeAlreadyExistsException e) {
                e.getMessage();
                return null;
            }
        }
}
