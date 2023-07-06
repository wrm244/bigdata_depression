## depression 项目后端API说明
> 运行环境：JDK@1.8 Springboot@2.7.13

> API v1.0.0

Base URLs:

* 测试环境: ``http://localhost``
* 正式环境: ``https://bdapi.gxist.cn``
  
## 贡献者

<table>
<tr>
    <td align="center">
        <a href="https://github.com/wrm244">
            <img src="https://avatars.githubusercontent.com/u/54385511?v=4" width="100;" alt="wrm244"/>
            <br />
            <sub><b>RiverMountain</b></sub>
        </a>
    </td>
    <td align="center">
        <a href="https://github.com/Gmorning730">
            <img src="https://avatars.githubusercontent.com/u/87710189?v=4" width="100;" alt="Gmorning730"/>
            <br />
            <sub><b>Morning Jia</b></sub>
        </a>
    </td>
    <td align="center">
        <a href="https://github.com/dignity666">
            <img src="https://avatars.githubusercontent.com/u/101318636?v=4" width="100;" alt="dignity666"/>
            <br />
            <sub><b>dignity666</b></sub>
        </a>
    </td>
    <td align="center">
        <a href="https://github.com/Guoxxxl">
            <img src="https://avatars.githubusercontent.com/u/138669665?v=4" width="100;" alt="Guoxxxl"/>
            <br />
            <sub><b>Guoxxxl</b></sub>
        </a>
    </td>
    <td align="center">
        <a href="https://github.com/peoplemaker">
            <img src="https://avatars.githubusercontent.com/u/100831511?v=4" width="100;" alt="peoplemaker"/>
            <br />
            <sub><b>peoplemaker</b></sub>
        </a>
    </td></tr>
</table>

## GET age-depressed

GET /api/age-depressed

年龄段与抑郁人数关系选择所有数据返回

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "age": "5-14",
      "depressedNo": 52264
    },
    {
      "age": "55-74",
      "depressedNo": 1658443
    },
    {
      "age": "35-54",
      "depressedNo": 2452141
    },
    {
      "age": "15-24",
      "depressedNo": 808542
    },
    {
      "age": "75+",
      "depressedNo": 653118
    },
    {
      "age": "25-34",
      "depressedNo": 1123912
    }
  ],
  "msg": ""
}
```

> 404 Response

```json
{
  "code": 404,
  "data": null,
  "msg": "请求资源未找到"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|记录不存在|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» age|string|true|none||none|
|»» depressedNo|integer|true|none||none|
|» msg|string|true|none||none|

状态码 **404**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|null|true|none||none|
|» msg|string|true|none||none|

## GET hdi-depressed

GET /api/hdi-depressed

人类每年发展系数与抑郁人数关系选择所有数据返回

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "hdiForYear": "0.55-0.60",
      "depressedNo": 19954
    },
    {
      "hdiForYear": "0.85-0.90",
      "depressedNo": 530630
    }
  ],
  "msg": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» hdiForYear|string|true|none||none|
|»» depressedNo|integer|true|none||none|
|» msg|string|true|none||none|

## GET year-depressed

GET /api/year-depressed

年份与抑郁人数关系选择所有数据返回

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "year": "2000",
      "depressedNo": 255832
    }
  ],
  "msg": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» year|string|true|none||none|
|»» depressedNo|integer|true|none||none|
|» msg|string|true|none||none|

## GET country-depressed-per

GET /api/country-depressed-per

不同国家的平均抑郁症患者人数

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "country": "Lithuania",
      "average_depression_ratio": 4.004393939393939
    },
    {
      "country": "Republic of Korea",
      "average_depression_ratio": 3.5325984848484837
    }
  ],
  "msg": ""
}
```

```json
{
  "code": 60001,
  "data": null,
  "msg": "业务错误，请检查代码"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» country|string|true|none||none|
|»» average_depression_ratio|number|true|none||none|
|» msg|string|true|none||none|

## GET year-per-depressed

GET /api/year-per-depressed

不同年份的不同性别抑郁症患者api选择所有数据返回

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|sex|query|array[string]| 否 |性别参数，male表示男性，female表示女性|

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "year": "1985",
      "depressed_no": 83584
    },
    {
      "year": "1986",
      "depressed_no": 86818
    }
  ],
  "msg": ""
}
```

```json
{
  "code": 60001,
  "data": null,
  "msg": "mal 参数传递错误！"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» year|string|true|none||none|
|»» depressed_no|integer|true|none||none|
|» msg|string|true|none||none|

## GET gdp-per-section

GET /api/gdp-per-section

各GPU不同区间返回的抑郁症患者人数

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "gdpPerCapita": "<300",
      "depressedNo": 603
    },
    {
      "gdpPerCapita": "300-500",
      "depressedNo": 20016
    },
    {
      "gdpPerCapita": "500-1000",
      "depressedNo": 178063
    },
    {
      "gdpPerCapita": ">1000",
      "depressedNo": 6549738
    }
  ],
  "msg": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» gdpPerCapita|string|true|none||none|
|»» depressedNo|integer|true|none||none|
|» msg|string|true|none||none|

## GET year-country-depressed-per

GET /api/year-country-depressed-per

返回不同年份不同国家的总抑郁率

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "country": "Puerto Rico",
      "year": "1986",
      "totalDepressedRate": 178.23000000000002
    },
    {
      "country": "Belize",
      "year": "1987",
      "totalDepressedRate": 31.41
    }
  ],
  "msg": ""
}
```

```json
{
  "code": 60001,
  "data": null,
  "msg": "业务错误，请检查代码"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» country|string|true|none||none|
|»» year|string|true|none||none|
|»» totalDepressedRate|number|true|none||none|
|» msg|string|true|none||none|

## GET year-country-depression-no

GET /api/year-country-depression-no

返回不同年份不同国家的总抑郁人数

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "country": "Colombia",
      "year": "1985",
      "totalDepressedNo": 1001
    },
    {
      "country": "Japan",
      "year": "1985",
      "totalDepressedNo": 23257
    }
  ],
  "msg": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» country|string|true|none||none|
|»» year|string|true|none||none|
|»» totalDepressedNo|integer|true|none||none|
|» msg|string|true|none||none|

## GET sex-depressed

GET /api/sex-depressed

男女不同的抑郁症人数

> 返回示例

> 成功

```json
{
  "code": 20011,
  "data": [
    {
      "sex": "male",
      "depressedSex": 5188910
    },
    {
      "sex": "female",
      "depressedSex": 1559510
    }
  ],
  "msg": ""
}
```

```json
{
  "code": 60001,
  "data": null,
  "msg": "业务错误，请检查代码"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» code|integer|true|none||none|
|» data|[object]|true|none||none|
|»» sex|string|true|none||none|
|»» depressedSex|integer|true|none||none|
|» msg|string|true|none||none|



