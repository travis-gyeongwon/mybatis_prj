package kr.co.sist.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RangeDTO {
	private int startNum,endNum; // 시작번호, 끝번호
	private String field, keyword; // 검색 필드 1,2,3, 검색 값
	private String fieldStr; // 검색 필드값에 대응되는 컬럼명의 문자열
	private String url;
	private int currentPage = 1;
	private int totalPage = 0;
	

	public String getFieldStr() {
		String[] fieldTitle = {"title", "content", "id"};
		int tempField = Integer.parseInt(field);
		if (!(tempField > 0 && tempField < 4)) {
			tempField = 1;
		}
		fieldStr = fieldTitle[Integer.parseInt(field) - 1];
		return fieldStr;
	}



}
