package patterns.patternAbstractFabric;

import patterns.patternAbstractFabric.abstractFactory.AbstractFactory;
import patterns.patternAbstractFabric.classes.PensionersBd;

public class Solution {
    public static void main(String[] args) {
        System.out.println(doParty(new PensionersBd()));
    }
    public static String doParty(AbstractFactory birthdaySet){
        return birthdaySet.getCake().getName()+" | "+birthdaySet.getCard().getName()+" | " +birthdaySet.getGift().getName();
    }
}
