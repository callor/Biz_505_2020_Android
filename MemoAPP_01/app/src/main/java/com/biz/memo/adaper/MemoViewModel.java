package com.biz.memo.adaper;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
<<<<<<< HEAD
=======
import androidx.lifecycle.ViewModel;
>>>>>>> d3dade02e2cd3f6e60c01b41804fb6f61101529a

import com.biz.memo.domain.MemoVO;
import com.biz.memo.repository.MemoRepository;

import java.util.List;

/*
DB와 연동하여 화면에 데이터를 보일때
직접 DB로 부터 데이터를 가져와서 보이지 않고
또하나의 중간 매개체를 통해서 처리를 수행하기 위해 사용하는 클래스로서
안드로이드에서는 이 클래스를 ViewModel 이라고 한다.
*/
public class MemoViewModel extends AndroidViewModel {

    private MemoRepository memoRepository;
<<<<<<< HEAD
    private LiveData<List<MemoVO>> memoList ;
=======
    private LiveData<List<MemoVO>> memoList;
>>>>>>> d3dade02e2cd3f6e60c01b41804fb6f61101529a

    public MemoViewModel(@NonNull Application application) {
        super(application);
        this.memoRepository = new MemoRepository(application);
        this.memoList = memoRepository.selectAll();
    }

<<<<<<< HEAD
    public LiveData<List<MemoVO>> selectAll(){
=======
    public LiveData<List<MemoVO>> selectAll() {
>>>>>>> d3dade02e2cd3f6e60c01b41804fb6f61101529a
        return this.memoList;
    }

    public void insert(MemoVO memoVO) {
        memoRepository.insert(memoVO);
    }


    public void delete(MemoVO post) {
        memoRepository.delete(post);
    }
}