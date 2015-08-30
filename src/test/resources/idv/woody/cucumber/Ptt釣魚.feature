Feature: Ptt釣魚
	身為一位專業小釣手
	當我在Ptt熱門板發癈文,可以引來網友漫罵,藉由去警局提告
	好讓我可以得到一筆合解金
	
Scenario: 釣魚成功,獲得合解金
	Given 一個有發文權限的帳號
	 When 登入Ptt
	  And 進入熱門板Gossip發癈文
	  And 網友推文罵我腦殘
	  And 進入警局提告
	 Then 得到一筆合解金