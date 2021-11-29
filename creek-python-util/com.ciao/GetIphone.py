#!/usr/bin/env python
# -*- coding:utf-8 -*-
import time
import json
import requests
import sys

# ======iphone抢购必选参数 START===============================================
# 抢购执行时间
executeTime = "2021-11-10 20:04:00"
# 用户cookie（来自浏览器）
cookiesFromBrowser = "shshshfpb=yyE3esM%20cfT28tFG6RxKI6w%3D%3D; shshshfpa=bd49091f-ab26-cc94-0017-12338fe4f61d-1590853059; pinId=vq7rY-E6k2Z4MdIs15_YFQ; __jdu=1631753131258379909723; pin=caochengyin1991; unick=%E6%B1%AA%E6%B1%AA_Joy; _tp=Jm4xbcjTlA01VOhBPpEI2g%3D%3D; _pst=caochengyin1991; user-key=abd0c380-6cd3-44f7-ba20-0ccb4eb95489; cn=11; __jdv=137720036|direct|-|none|-|1635813791605; ipLoc-djd=1-2800-55837-0.2361275796; areaId=1; UM_distinctid=17cfd611da17ad-047667fd1cfc51-561a135a-1fa400-17cfd611da29b9; CNZZDATA1256793290=2040592639-1636331645-https%253A%252F%252Fitem.jd.com%252F%7C1636342445; sso.jd.com=BJ.A283CA589995E0A8FD7A8ED2E55859B50420211110084804; shshshfp=bef7665e6e2f94f517ca3df04f3617f0; TrackID=1S48aVibc2pcTchAnNhEV6RYpfCAd1p9L8XsmC4fyX1MSQsxfSXu_RTncHuohRttpwvrznqd84-hvGs6J7IJuI0QsshTypUOYuzIV-dh-RNPy0jrZP_3SX8WIG_wjBGon; thor=C0483A1D0F2B24C0E9F6848376FF8C455E29B3E54DF6C7D2C35F135EB576E8D1D815B88D61EED82092B905932E1D5097D3CD7030C6A0AB85AB06CF21BD1BB23D14A63B246244A4FC590F77FDCF5AE1CD54C6FF1799DBB09A2C67FAD23AD470AD090BCB160BCD331656C6EAEB95CB77CDEE7BEFA0241A18B1A219F80C5B5183A0D51C76D052522CDB0C90C741D1DA1E0FD2BFCBDF22B76BC3155F24A83EFC112C; ceshi3.com=201; __jda=122270672.1631753131258379909723.1631753131.1636532111.1636542112.203; __jdc=122270672; token=01e8b5a3cb8187d78b711a490ed5f42c,3,909190; shshshsID=108728beedc344e79dd27530388dd2ce_4_1636542156686; __jdb=122270672.9.1631753131258379909723|203.1636542112; seckillSku=100026667904; seckillSid=; ip_cityCode=2802; 3AB9D23F7A4B3C9B=JSMAG7TFCTDJEF4WLETKKKFTTDU25MC5FIDGSKE7GOJKR5BZN44HSKRGEKM3JEIO5WXXGMD3ETCXB7LA7KRFP2XHZA"
# 抢购url ==> iphone13pro
getIphoneUrl = 'https://marathon.jd.com/seckillnew/orderService/pc/submitOrder.action?skuId=100026667904'
# ======iphone抢购必选参数 END=================================================

# headers
headers = {
    'Content-Type': 'application/json;charset=UTF-8',
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.54 Safari/537.36 Edg/95.0.1020.30'
}
# 用户cookies
cookies = dict(cookies_are=cookiesFromBrowser)
# 抢购请求参数
getIphonePayload = {
    'skuId': 100026667904,
    'num': 1,
    'addressId': 2361275796,
    'name': '瓜瓜',
    'provinceId': 1,
    'cityId': 2800,
    'countyId': 55837,
    'townId': 0,
    'addressDetail': '中关村南大街6号中电信息大厦八楼（慧算账）',
    'mobile': '187****8925',
    'mobileKey': 'e4b685c34c5fb789f976d76f029ad365',
    # 'email': ,
    # 'postCode': ,
    'invoiceTitle': 4,
    'invoiceContent': 1,
    'invoicePhone': '156****9128',
    'invoicePhoneKey': 'f3bf5035bc0e203b6bf4cb455b03be4c',
    'invoice': True,
    'codTimeType': 3,
    'paymentType': 4,
    # 'areaCode': ,
    'overseas': 0,
    # 'phone': ,
    'eid': 'JSMAG7TFCTDJEF4WLETKKKFTTDU25MC5FIDGSKE7GOJKR5BZN44HSKRGEKM3JEIO5WXXGMD3ETCXB7LA7KRFP2XHZA',
    'fp': '50465f89ec37a710588c418bcad84531',
    'token': 'cdfee01faa7316c1445963a257713bf5',
    # 'pru': ,
    'provinceName': '北京',
    'cityName': '海淀区',
    'countyName': '中关村街道',
    'townName': '',
    'sk': 'EhHgpQVIdjkWbVbGP1LlC'
}

currentTime = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
if currentTime == executeTime:
    print('立即执行iphone抢购操作')

elif currentTime > executeTime:
    print(f'当前时间【{currentTime}】后于iphone抢购开始执行时间【{executeTime}】，iphone抢购程序自动退出')
    sys.exit(0)

else:
    while(currentTime != executeTime):
        currentTime = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
        # print(f'iphone抢购倒计时（自旋等待）==>【{currentTime}】')


# 计数器
counter = 0
# 持续抢购
while counter <= 10000000:
    queryRequest = requests.post(
        url=getIphoneUrl, json=getIphonePayload, headers=headers, cookies=cookies)
    statusCode = queryRequest.status_code
    responseText = queryRequest.text
    print(f'==> statusCode：【{statusCode}】；responseText：{responseText}')
    if statusCode != 200:
        print('抢购请求失败')

    else:
        response = json.loads(responseText)
        if response.get('success', None) == True:
            print(f'抢购成功，{responseText}')
            break

        elif response.get('islogin', None) == '-1':
            print('抢购失败，用户未登录')
            break

        else:
            print(f'抢购结果：{response["errorMessage"]}')

    # 等待0.7秒
    time.sleep(0.7)
    # 计数加1
    counter += 1
