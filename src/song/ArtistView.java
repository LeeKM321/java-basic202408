package song;

import static util.Utility.input;
import static util.Utility.makeLine;

// 화면단(콘솔)을 담당하는 클래스
public class ArtistView {

    private static ArtistRepository ar;

    static {
        ar = new ArtistRepository();
    }

    // 메인 실행 기능 (Main 클래스에서 호출되는 프로그램의 시작 부분입니다.)
    public static void start() {

        // 세이브 파일 로드
        ar.loadData();

        while (true) {
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 현재까지의 데이터 저장하기");
            System.out.println("# 4. 프로그램 종료");
            makeLine();

            System.out.println("\n원하시는 메뉴의 번호를 입력하세요!");
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    insertProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    ar.saveData();
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로그램 강제 종료.
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 선택하셨습니다.");
            }

        }

    }

    // 2번 메뉴에 대한 입출력 실행 내용
    private static void searchProcess() {

        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String artistName = input("- 가수명: ");

      /*
              입력받은 가수가 존재한다면 -> 가수명과 가수의 노래 목록을 전부 출력
              존재하지 않는다면 -> "해당 가수는 등록되지 않았습니다." 출력
              힌트: ar.isRegisted()
       */

        if (ar.isRegisted(artistName)) {
            ar.showSongList(artistName);
        } else { // 없는 가수라면
            System.out.println("\n해당 가수는 등록되지 않았습니다.");
        }

    }

    // 1번 메뉴에 대한 입출력 실행 내용
    private static void insertProcess() {

        System.out.println("\n# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명: ");
        String songName = input("- 노래명: ");

      /*
              기존에 등록된 가수인지를 먼저 체크.
              등록된 가수가 아니다 -> 새 객체를 생성해서 정보를 저장 (ar.addNewArtist())
                              -> "%s의 정보가 신규 등록 되었습니다."
              등록된 가수다 -> 새 객체생성이 아닌, 기존 가수 정보에서 노래만 추가.
                         -> 노래를 추가할 때는, 기존에 등록된 노래인지를 확인.
                            "[%s]곡은 이미 등록된 노래입니다."
                            "%s 가수의 노래목록에 %s 곡이 추가되었습니다."
       */

        if (!ar.isRegisted(artistName)) { // 신규 등록인가?
            // 실제로 가수 정보를 등록할건데, 어디에? -> map에 저장!
            ar.addNewArtist(artistName, songName);

            System.out.printf("\n%s님이 신규 등록 되었습니다.\n", artistName);
        } else {
            // 신규 등록이 아니라 기존 등록 가수에 곡만 추가하는 것인가?
            boolean flag = ar.addNewSong(artistName, songName);

            if (flag) { // 기존 가수의 리스트에 노래가 잘 추가됨.
                System.out.printf("\n# %s 가수의 노래목록에 %s 곡이 추가되었습니다."
                        , artistName, songName);
            } else { // 이미 노래가 중복된 경우
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.", songName);
            }
        }






    }

}

















