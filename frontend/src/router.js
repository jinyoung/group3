
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MeetingRoomManager from "./components/listers/MeetingRoomCards"
import MeetingRoomDetail from "./components/listers/MeetingRoomDetail"

import 회의실리스트View from "./components/회의실리스트View"
import 회의실리스트ViewDetail from "./components/회의실리스트ViewDetail"
import 주소록관리Manager from "./components/listers/주소록관리Cards"
import 주소록관리Detail from "./components/listers/주소록관리Detail"

import 사용자리스트View from "./components/사용자리스트View"
import 사용자리스트ViewDetail from "./components/사용자리스트ViewDetail"
import ConferenceManager from "./components/listers/ConferenceCards"
import ConferenceDetail from "./components/listers/ConferenceDetail"

import 예약리스트View from "./components/예약리스트View"
import 예약리스트ViewDetail from "./components/예약리스트ViewDetail"
import 회의실정보View from "./components/회의실정보View"
import 회의실정보ViewDetail from "./components/회의실정보ViewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/meetingRooms',
                name: 'MeetingRoomManager',
                component: MeetingRoomManager
            },
            {
                path: '/meetingRooms/:id',
                name: 'MeetingRoomDetail',
                component: MeetingRoomDetail
            },

            {
                path: '/회의실리스트',
                name: '회의실리스트View',
                component: 회의실리스트View
            },
            {
                path: '/회의실리스트/:id',
                name: '회의실리스트ViewDetail',
                component: 회의실리스트ViewDetail
            },
            {
                path: '/주소록관리',
                name: '주소록관리Manager',
                component: 주소록관리Manager
            },
            {
                path: '/주소록관리/:id',
                name: '주소록관리Detail',
                component: 주소록관리Detail
            },

            {
                path: '/사용자리스트',
                name: '사용자리스트View',
                component: 사용자리스트View
            },
            {
                path: '/사용자리스트/:id',
                name: '사용자리스트ViewDetail',
                component: 사용자리스트ViewDetail
            },
            {
                path: '/conferences',
                name: 'ConferenceManager',
                component: ConferenceManager
            },
            {
                path: '/conferences/:id',
                name: 'ConferenceDetail',
                component: ConferenceDetail
            },

            {
                path: '/예약리스트',
                name: '예약리스트View',
                component: 예약리스트View
            },
            {
                path: '/예약리스트/:id',
                name: '예약리스트ViewDetail',
                component: 예약리스트ViewDetail
            },
            {
                path: '/회의실정보',
                name: '회의실정보View',
                component: 회의실정보View
            },
            {
                path: '/회의실정보/:id',
                name: '회의실정보ViewDetail',
                component: 회의실정보ViewDetail
            },



    ]
})
