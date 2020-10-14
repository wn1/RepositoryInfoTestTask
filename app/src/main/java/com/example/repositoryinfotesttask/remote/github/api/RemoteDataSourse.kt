package com.example.repositoryinfotesttask.remote.github.api

import com.example.repositoryinfotesttask.remote.github.api.repository.RepositoryListData
import io.reactivex.rxjava3.core.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


//DataSource для сервиса GitHub

class RemoteDataSource()
{
    interface GitHubService {

        companion object {
            val gitHubUrl = "https://github.com/"
        }

        @GET("users/{user}/repos")
        fun getListRepos(@Path("user") userName: String?): Observable<RepositoryListData?>

    }

    fun newGitHubServiceInstance(): GitHubService {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC)

        val client: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        val gitHubRetrofit = Retrofit.Builder()
            .baseUrl(GitHubService.gitHubUrl)
            .client(client)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return gitHubRetrofit.create(GitHubService::class.java)
    }
}