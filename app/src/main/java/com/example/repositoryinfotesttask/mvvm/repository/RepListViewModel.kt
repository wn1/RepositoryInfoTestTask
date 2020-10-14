package com.example.repositoryinfotesttask.mvvm.repository

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.repositoryinfotesttask.remote.github.api.repository.RepositoryListData
import io.reactivex.rxjava3.disposables.Disposable



class RepListViewModel : ViewModel() {

    val repositoryList = MutableLiveData<RepositoryListData>()

    val repositoryListDisposable: Disposable? = null
    fun loadRepositoryList(username: String?) {
        repositoryListDisposable?.dispose()
//        TODO get repository list
//        repositoryListDisposable =
    }
}