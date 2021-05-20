package yogiewisesa.jwork.controller;

import org.springframework.web.bind.annotation.*;
import yogiewisesa.jwork.*;

import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController
public class BonusController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllJob(){
        ArrayList<Bonus> bonus = null;
        bonus = DatabaseBonus.getBonusDatabase();
        return bonus;
    }

    @RequestMapping(value = "/{referralCode}", method = RequestMethod.GET)
    public Bonus getBonusByReferralCode(@PathVariable String referralCode){
        Bonus bonus = null;
        bonus = DatabaseBonus.getBonusByReferralCode(referralCode);
        return bonus;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value = "referralCode") String referralCode,
                          @RequestParam(value = "extraFee") int extraFee,
                          @RequestParam(value = "minTotalFee") int minTotalFee,
                          @RequestParam(value = "active") boolean active)
            throws ReferralCodeAlreadyExistsException
        {
            Bonus bonus = null;
            bonus = DatabaseBonus.getBonusByReferralCode(referralCode);
            if (bonus.getReferralCode() == referralCode){
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
            Bonus bonus1 = new Bonus(DatabaseBonus.getLastId()+1, referralCode, extraFee, minTotalFee, active);
            boolean success = DatabaseBonus.addBonus(bonus1);

            if (success)
            {
                return bonus1;
            } else
            {
                return null;
            }
        }
}
