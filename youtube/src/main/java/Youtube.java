public class Youtube {
    public static String random_youtube(int a) {
        String re = "";
        a--;
        for (int i = 0; i <= a; i++) {
            String[] when = {"아침에", "점심에", "낮에", "저녁에", "한밤중에", "새벽에", "생일에", "2030년에"};
            String[] where = {"달에서", "축구장에서", "노래방에서", "학교에서", "화장실에서", "변기 안에서", "하수처리장에서", "피씨방에서", "맥도날드에서", "공장에서", "노인회관에서", "도박장에서", "카페에서", "엘리베이터 안에서", "텐트 안에서", "집에서", "납골당에서", "장례식장에서", "빕스에서", "아웃백에서", "소 농장에서", "사과나무 농장에서", "버스 안에서", "도서관에서", "동굴에서", "오션월드에서", "에버랜드에서", "치킨집에서", "우주선에서", "술집에서", "들판에서", "에베레스트산에서", "남극에서", "사막에서", "태평양 한가운데에서", "태평양 한가운데에서"};
            String[] how = {"웃으며", "방귀를 뀌며", "똥을 싸면서", "물구나무를 서서", "노래를 부르며", "더럽게", "가식스럽게", "가증스럽게", "각박스럽게", "감격스럽게", "거드럭스럽게", "거만스럽게", "거북스럽게", "거짓스럽게", "게걸스럽게", "고급스럽게", "고풍스럽게", "틀딱같이", "병걸린 것처럼", "어딘가가 아픈 것처럼", "딱딱하게", "과감하게", "괴팍하게", "보기 흉하게", "보잘것없게", "초라하게", "기괴하게", "괴랄하게", "신박하게", "까다롭게", "냉정하게", "당황스럽게", "맛있게", "맛없게", "밉상스럽게", "재밌게", "신나게", "감격스럽게", "죄송스럽게", "죄송스럽게"};
            String[] whilst = {"똥을 싸면서", "넘어지면서", "코를 파면서", "땅을 파면서", "소리를 지르면서", "울부짖으면서", "축구하면서", "물구나무 선 상태로", "치킨을 먹으면서", "방사능에 피폭되면서", "쓰레기를 버리면서", "쓰레기를 버리면서"};
            String[] what = {"#대상 뒷광고하기", "댓글 읽기", "영화 리뷰하기", "번개 맞기", "#음식 먹방", "#게임 하기", "#대상 참교육하기", "#음식 먹으면서 #게임 하기", "#나쁜짓 #대상 참교육하기", "#스피드런 세계 최고기록 세우기", "#게임 스피드런하기", "브이로그 찍기", "차에 치이기", "사과영상 올리고 자숙하기", "사과영상 올리고 자숙하기"};

            int when_int = (int) (Math.random() * 7);
            int where_int = (int) (Math.random() * 34);
            int how_int = (int) (Math.random() * 39);
            int whilst_int = (int) (Math.random() * 11);
            int what_int = (int) (Math.random() * 14);

            String contents = "유튜브 컨텐츠 추천: " + when[when_int] + " " + where[where_int] + " " + how[how_int] + " " + whilst[whilst_int] + " " + what[what_int];


            if (contents.contains("#게임")) {
                int random = (int) (Math.random() * 20);
                if (random == 0) contents = contents.replace("#게임", "기적의검");
                else if (random == 1) contents = contents.replace("#게임", "탕탕특공대");
                else if (random == 2) contents = contents.replace("#게임", "라이더");
                else if (random == 3) contents = contents.replace("#게임", "왕이되는자");
                else if (random == 4) contents = contents.replace("#게임", "거지키우기");
                else if (random == 5) contents = contents.replace("#게임", "바운스볼");
                else if (random == 6) contents = contents.replace("#게임", "마인크래프트 포켓에디션");
                else if (random == 7) contents = contents.replace("#게임", "황새 오래 걷기 1,000m 달성");
                else if (random == 8) contents = contents.replace("#게임", "크롬 공룡 게임");
                else if (random == 9) contents = contents.replace("#게임", "크롬 공룡 게임 100,000점 달성");
                else if (random == 10) contents = contents.replace("#게임", "기적의 검 전서버 1위 달성");
                else if (random == 11) contents = contents.replace("#게임", "노맨즈 스카이 맵 끝까지 도달");
                else if (random == 12) contents = contents.replace("#게임", "슈의 라면가게 4만원 달성");
                else if (random == 13) contents = contents.replace("#게임", "지오메트리 대쉬 Sonic Wave 연속 2번 클리어");
                else if (random == 14) contents = contents.replace("#게임", "라이즈 오브 킹덤즈 전서버 세계 1위 달성");
                else if (random == 15) contents = contents.replace("#게임", "테트리스");
                else if (random == 16) contents = contents.replace("#게임", "개드립피하기 10만점 달성");
                else if (random == 17) contents = contents.replace("#게임", "거지키우기 돈 1,000경원 달성");
                else if (random == 18) contents = contents.replace("#게임", "지구 한 바퀴 달리기");
                else if (random == 19) contents = contents.replace("#게임", "지구 화성 왕복");
                else if (random == 20) contents = contents.replace("#게임", "목성에 착륙");
            }
            if (contents.contains("#나쁜짓")) {
                int random = (int) (Math.random() * 20);
                if (random == 0) contents = contents.replace("#나쁜짓", "딱풀 먹은");
                else if (random == 1) contents = contents.replace("#나쁜짓", "요플레 뚜껑 안 핥고 버린");
                else if (random == 2) contents = contents.replace("#나쁜짓", "닭다리 2개 혼자 먹은");
                else if (random == 3) contents = contents.replace("#나쁜짓", "예고편 올려놓고 유튜브 잠수 탄");
                else if (random == 4) contents = contents.replace("#나쁜짓", "남의 연애사에 개입한");
                else if (random == 5) contents = contents.replace("#나쁜짓", "장난전화한");
                else if (random == 6) contents = contents.replace("#나쁜짓", "고양이 울린");
                else if (random == 7) contents = contents.replace("#나쁜짓", "뒷광고 한");
                else if (random == 8) contents = contents.replace("#나쁜짓", "피자 한조각, 치킨 한입 먹고 배달부가 먹었다고 한");
                else if (random == 9) contents = contents.replace("#나쁜짓", "배달하면서 치킨 한 조각 빼먹은");
                else if (random == 10) contents = contents.replace("#나쁜짓", "주차할 때 자리 2칸 먹은");
                else if (random == 11) contents = contents.replace("#나쁜짓", "뽑기 확률 조작한");
                else if (random == 12) contents = contents.replace("#나쁜짓", "치킨값 뻥튀기한");
                else if (random == 13) contents = contents.replace("#나쁜짓", "축구하다가 자살골 넣은");
                else if (random == 14) contents = contents.replace("#나쁜짓", "남의 바퀴벌레 훔쳐먹은");
                else if (random == 15) contents = contents.replace("#나쁜짓", "남의 테이프 훔쳐먹은");
                else if (random == 16) contents = contents.replace("#나쁜짓", "남의 #음식 훔쳐먹은");
                else if (random == 17) contents = contents.replace("#나쁜짓", "남의 #음식 훔쳐먹은");
                else if (random == 18) contents = contents.replace("#나쁜짓", "남의 #음식 훔쳐먹은");
                else if (random == 19) contents = contents.replace("#나쁜짓", "남의 #음식 훔쳐먹은");
                else if (random == 20) contents = contents.replace("#나쁜짓", "남의 #음식 훔쳐먹은");
            }

            if (contents.contains("#대상")) {
                int random = (int) (Math.random() * 20);
                if (random == 0) contents = contents.replace("#대상", "참치");
                else if (random == 1) contents = contents.replace("#대상", "바퀴벌레");
                else if (random == 2) contents = contents.replace("#대상", "고등어");
                else if (random == 3) contents = contents.replace("#대상", "철갑상어");
                else if (random == 4) contents = contents.replace("#대상", "갈구리무늬 꽃수레 밤나비");
                else if (random == 5) contents = contents.replace("#대상", "외투");
                else if (random == 6) contents = contents.replace("#대상", "쥐");
                else if (random == 7) contents = contents.replace("#대상", "바오밥나무");
                else if (random == 8) contents = contents.replace("#대상", "연어");
                else if (random == 9) contents = contents.replace("#대상", "감자");
                else if (random == 10) contents = contents.replace("#대상", "개");
                else if (random == 11) contents = contents.replace("#대상", "길고양이");
                else if (random == 12) contents = contents.replace("#대상", "애벌레");
                else if (random == 13) contents = contents.replace("#대상", "지렁이");
                else if (random == 14) contents = contents.replace("#대상", "번데기");
                else if (random == 15) contents = contents.replace("#대상", "날다람쥐");
                else if (random == 16) contents = contents.replace("#대상", "고릴라");
                else if (random == 17) contents = contents.replace("#대상", "원숭이");
                else if (random == 18) contents = contents.replace("#대상", "닭");
                else if (random == 19) contents = contents.replace("#대상", "병아리");
                else if (random == 20) contents = contents.replace("#대상", "강아지");
            }
            if (contents.contains("#스피드런")) {
                int random = (int) (Math.random() * 15);
                if (random == 0) contents = contents.replace("#스피드런", "줄넘기 1개 빨리 뛰기");
                else if (random == 1) contents = contents.replace("#스피드런", "길에서 만원 빨리 줍기");
                else if (random == 2) contents = contents.replace("#스피드런", "1cm 빨리 달리기");
                else if (random == 3) contents = contents.replace("#스피드런", "물티슈 한 통 빨리 먹기");
                else if (random == 4) contents = contents.replace("#스피드런", "#음식 500g 빨리 먹기");
                else if (random == 5) contents = contents.replace("#스피드런", "테이프 10cm 빨리 뜯기");
                else if (random == 6) contents = contents.replace("#스피드런", "핸드폰 비밀번호 빨리 누르기");
                else if (random == 7) contents = contents.replace("#스피드런", "밖에 나가서 번개 빨리 맞기");
                else if (random == 8) contents = contents.replace("#스피드런", "자전거로 10cm 빨리 가기");
                else if (random == 9) contents = contents.replace("#스피드런", "알코올램프로 고기 빨리 굽기");
                else if (random == 10) contents = contents.replace("#스피드런", "알코올램프로 고기 빨리 굽기");
                else if (random == 11) contents = contents.replace("#스피드런", "독버섯 빨리 먹기");
                else if (random == 12) contents = contents.replace("#스피드런", "볼펜 빨리 사기");
                else if (random == 13) contents = contents.replace("#스피드런", "와이파이 빨리 연결하기");
                else if (random == 14) contents = contents.replace("#스피드런", "#음식 300g 빨리 먹기");
                else if (random == 15) contents = contents.replace("#스피드런", "#음식 1kg 빨리 먹기");
            }


            if (contents.contains("#음식")) {
                int random = (int) (Math.random() * 20);
                if (random == 0) contents = contents.replace("#음식", "키보드");
                else if (random == 1) contents = contents.replace("#음식", "바퀴벌레");
                else if (random == 2) contents = contents.replace("#음식", "캡사이신소스");
                else if (random == 3) contents = contents.replace("#음식", "마요네즈");
                else if (random == 4) contents = contents.replace("#음식", "휘발유");
                else if (random == 5) contents = contents.replace("#음식", "면도크림케이크");
                else if (random == 6) contents = contents.replace("#음식", "딱풀");
                else if (random == 7) contents = contents.replace("#음식", "나무");
                else if (random == 8) contents = contents.replace("#음식", "짱돌");
                else if (random == 9) contents = contents.replace("#음식", "새총");
                else if (random == 10) contents = contents.replace("#음식", "알코올램프");
                else if (random == 11) contents = contents.replace("#음식", "독버섯");
                else if (random == 12) contents = contents.replace("#음식", "볼펜");
                else if (random == 13) contents = contents.replace("#음식", "유리 플라스크");
                else if (random == 14) contents = contents.replace("#음식", "클로로트리플루오로에틸렌 중합체");
                else if (random == 15) contents = contents.replace("#음식", "물티슈");
                else if (random == 16) contents = contents.replace("#음식", "니코틴");
                else if (random == 17) contents = contents.replace("#음식", "타르");
                else if (random == 18) contents = contents.replace("#음식", "타르타르소스");
                else if (random == 19) contents = contents.replace("#음식", "머리카락");
                else if (random == 20) contents = contents.replace("#음식", "취두부");
            }

            re += "\n" + contents;
        }
        return re.toString();
    }
}
