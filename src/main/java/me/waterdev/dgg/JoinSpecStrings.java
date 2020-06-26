package me.waterdev.dgg;

import java.util.Random;

public class JoinSpecStrings {

    private int leftLimit = 48; // numeral '0'
    private int rightLimit = 122; // letter 'z'
    private int targetStringLength = 10;
    private Random random = new Random();

    private String join = random.ints(leftLimit, rightLimit + 1)
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

    private String spec = random.ints(leftLimit, rightLimit + 1)
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

    private String party = random.ints(leftLimit, rightLimit + 1)
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

    public String getJoin() {
        return join;
    }

    public String getSpec() {
        return spec;
    }

    public String getParty() {
        return party;
    }
}
