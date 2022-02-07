package cn.allwayz.Learning.Competitions;

/**
 * It only encodes capital letters; i.e., the plaintext alphabet is the set Ω = {A, B, C, . . . , Z}.
 * Any other characters (e.g., whitespace, punctuation, etc.) in the plaintext are
 * removed before the message is encoded. <br>
 *
 * It is a simple substitution cipher; i.e., Queasy substitutes a
 * given character x with another character y,
 * where x ∈ Ω and y ∈ Ω.<br>
 *
 * Like Enigma, Queasy never encodes a character to itself; i.e.,
 * plaintext character x encodes to ciphertext
 * character y such that x 1 y.
 *
 *
 * @author allwayz
 * @create 2022-02-06 14:02
 */
public class Competition1 {
    public static String ciphertext = "ETEVHTWGSAHGWYVPNKQOEGWYVPNKPDEPHWAOVWPFWNHANEVWXAVOAEAJEUXTAOWBTEVHTWGSAHGWYVPNQAOQVGTYHAVAXETOANFQEOIQPLANTEVHFYNSQVEBEOWSKNCKLOPEVTYJAUFWYNCOTWZESQEPERQSQOPEVYCEVHEGDEHEVHEYOPNQEEHWYFTKTEVHTWGSAHGWYVPNKQOWVAPDEPWVTKFWNHANOTEVHTWGSAHGWYVPNQAOPDANAENAWVTKPIWHWYFTKTEVHTWGSAHGWYVPNQAOQVPDAIWNTHWVAWBPDAUQOYLFASQOPEVIDEPQOPDAWPDANWVA";
    public static String phrase = "NEPALSERBIASWITZERLANDBURKINAFASOKYRGYZSTANLUXEMBOURGSLOVAKIATAJIKISTANUGANDACHADANDAUSTRIA";

    public static void main(String[] args) {
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Hint phrase: " + phrase);
    }
}
