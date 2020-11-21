import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void testWordCount() {
  

        TreeMap<Integer, Set<String>> expected = new TreeMap<>(Collections.reverseOrder());
        expected.put(1, Collections.singleton(""));

//        TreeMap<Integer, Set<String>> expected = new TreeMap<>(Collections.reverseOrder());
//        expected.put(18, new HashSet<String>(Collections.singleton("you")));
//        expected.put(9, Collections.singleton("the"));
//        expected.put(8, Collections.singleton("a, and, i"));
//        expected.put(6, Collections.singleton("that"));
//        expected.put(5, Collections.singleton("have, to"));
//        expected.put(3, Collections.singleton("in, use, of, dont, we, on"));
//        expected.put(2, Collections.singleton("lives, want, words, it, while, way, as, walls, what, provide, me, luxury, wall"));
//        expected.put(1, Collections.singleton("explain, very, guns, saved, lieutenant, about, your, these, saves, would, pick, fathom, grotesque, incomprehensible, because, greater, give, sleeps, went, loyalty, myself, them, then, something, at, knowing, santiago, curse, weinberg, entitled, whos, be, probably, world, freedom, responsibility, are, by, tragic, backbone, man, stand, inclination, think, gonna, suggest, places, thank, under, punchline, honor, existence, defending, questions, do, manner, down, either, son, post, than, talk, has, up, those, possibly, which, otherwise, need, like, my, parties, know, santiagos, rises, who, deep, code, death, rather, for, weep, life, nor, guarded, can, weapon, not, men, said, just, live, spent, damn, with, truth, marines, neither, time, blanket"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        //assertEquals(HandleTruth.wordCount("son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to", ps), expected);
        assertEquals(HandleTruth.wordCount("", ps), expected);
    }

    public static void main(String[] args) {
        PrintStream toScreen = System.out;
        HandleTruth.wordCount("son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to", toScreen);
        System.out.println();

        toScreen = System.out;
        HandleTruth.wordCount("how many words are any words duplicate", toScreen);
        System.out.println();

        toScreen = System.out;
        HandleTruth.wordCount("", toScreen);
        System.out.println();
    }
}