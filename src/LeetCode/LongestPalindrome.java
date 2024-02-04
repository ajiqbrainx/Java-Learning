package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
    public static void main(String[] args) {
        String name = "jkexvzsqshsxyytjmmhauoyrbxlgvdovlhzivkeixnoboqlfemfzytbolixqzwkfvnpacemgpotjtqokrqtnwjpjdiidduxdprngvitnzgyjgreyjmijmfbwsowbxtqkfeasjnujnrzlxmlcmmbdbgryknraasfgusapjcootlklirtilujjbatpazeihmhaprdxoucjkynqxbggruleopvdrukicpuleumbrgofpsmwopvhdbkkfncnvqamttwyvezqzswmwyhsontvioaakowannmgwjwpehcbtlzmntbmbkkxsrtzvfeggkzisxqkzmwjtbfjjxndmsjpdgimpznzojwfivgjdymtffmwtvzzkmeclquqnzngazmcfvbqfyudpyxlbvbcgyyweaakchxggflbgjplcftssmkssfinffnifsskmsstfclpjgblfggxhckaaewyygcbvblxypduyfqbvfcmzagnznquqlcemkzzvtwmfftmydjgvifwjoznzpmigdpjsmdnxjjfbtjwmzkqxsizkggefvztrsxkkbmbtnmzltbchepwjwgmnnawokaaoivtnoshywmwszqzevywttmaqvncnfkkbdhvpowmspfogrbmuelupcikurdvpoelurggbxqnykjcuoxdrpahmhiezaptabjjulitrilkltoocjpasugfsaarnkyrgbdbmmclmxlzrnjunjsaefkqtxbwoswbfmjimjyergjygzntivgnrpdxuddiidjpjwntqrkoqtjtopgmecapnvfkwzqxilobtyzfmeflqobonxiekvizhlvodvglxbryouahmmjtyyxshsqszvxekj";
        List<String> list = new ArrayList<>();
        var outputList = reverse(name, list, 0);
        String output = "";

        for (int i = 0; i < outputList.size(); i++) {
            if(outputList.get(i).toString().length() >output.length()){
                output=outputList.get(i).toString();
            }
        }

        System.out.println(output);
    }

    static List reverse(String name, List<String> list, int index) {

        StringBuilder stringBuilder = new StringBuilder();
        if (name.length() > index) {
            for (int i = index; i < name.length(); i++) {

                stringBuilder.append(name.charAt(i));
                StringBuilder ss = new StringBuilder(stringBuilder).reverse();
                if (stringBuilder.toString().equals(ss.toString())) {
                    list.add(stringBuilder.toString());
                }

            }

            return reverse(name, list, index + 1);
        }
        return list;


    }
}
