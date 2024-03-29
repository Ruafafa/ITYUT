package fun.ruafafa.ityut.client;

import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;
import fun.ruafafa.ityut.interceptor.ITyutCookieInterceptor;
import fun.ruafafa.ityut.interceptor.ITyutHeaderInterceptor;
import fun.ruafafa.ityut.interceptor.ITyutUserInterceptor;
import fun.ruafafa.ityut.interceptor.TmspAddressSource;


import java.util.Map;

@Address(source = TmspAddressSource.class)
@BaseRequest(interceptor = {ITyutCookieInterceptor.class, ITyutHeaderInterceptor.class, ITyutUserInterceptor.class})
public interface TmspExamClient {

    /**
     * 获取考试时间安排
     * @return
     */
    @Post(
            url = "/Tschedule/C5KwBkks/GetKsxxByDesk",
            contentType = "application/x-www-form-urlencoded",
            headers = {"X-Requested-With: XMLHttpRequest"},
            readTimeout = 10000
    )
    ForestResponse<String> getExamSchedule(String account, @Body Map<String, Object> data);
}
