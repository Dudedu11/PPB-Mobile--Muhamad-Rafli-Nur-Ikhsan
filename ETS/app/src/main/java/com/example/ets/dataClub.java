package com.example.ets;

import java.util.ArrayList;

public class dataClub {
    private static String [] namatim = {
        "1 Bali United",
            "2 Persib",
            "3 Persebaya",
            "4 Bhayangkara",
            "5 Arema"
    };

    private static int [] pointim = {
            69,
            66,
            59,
            59,
            58
    };

    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int posisi = 0; posisi <namatim.length; posisi++){
            Club club = new Club();
            club.setNama(namatim[posisi]);
            club.setPoint(pointim[posisi]);
            list.add(club);
        }
        return list;
    }
}
