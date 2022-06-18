package com.hmyh.hmyhnews.framework.model

import androidx.lifecycle.LiveData
import com.hmyh.hmyhnews.domain.NewsListVO

interface HmyhNewsModel {

    fun loadNewsList(
        page: Int,
        pageSie: Int,
        onSuccess: (newsListVO: NewsListVO)->Unit,
        onFailure: (String)->Unit
    )

    fun getNewVO(): LiveData<NewsListVO>

    fun loadMoreNewList(
        url: String,
        page: Int,
        pageSie: Int,
        onSuccess: (newsListVO: NewsListVO)->Unit,
        onFailure: (String)->Unit
    )

}