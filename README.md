# ImageViewer - Android图片查看器

ImageViewer是一个基于Android原生开发的图片查看器应用，使用Kotlin语言开发，采用现代Android开发技术栈。应用提供了直观的图片浏览界面和流畅的用户体验。

## 主要功能

- **图片列表浏览**：以网格形式展示图片缩略图
- **图片详情查看**：点击缩略图查看大图
- **响应式设计**：适配不同屏幕尺寸
- **现代化UI**：采用Material Design设计语言
- **流畅交互**：支持点击切换和返回导航

## 技术栈

### 开发语言
- **Kotlin** - 主要开发语言

### 核心技术
- **Android SDK** - 目标SDK 36，最低支持API 24
- **Jetpack Compose** - 现代化UI框架
- **View Binding** - 视图绑定技术
- **RecyclerView** - 列表展示组件

### 主要依赖
- `androidx.core:core-ktx` - Android KTX扩展
- `androidx.lifecycle:lifecycle-runtime-ktx` - 生命周期管理
- `androidx.activity:activity-compose` - Compose Activity支持
- `androidx.compose.ui` - Compose UI组件
- `androidx.compose.material3` - Material 3设计系统
- `androidx.recyclerview:recyclerview` - 列表组件
- `androidx.cardview:cardview` - 卡片视图
- `androidx.constraintlayout:constraintlayout` - 约束布局

## 📁 项目结构

```
app/src/main/
├── java/com/example/imageviewer/
│   ├── MainActivity.kt              # 主活动（Compose版本）
│   ├── ImageDetailActivity.kt       # 图片详情活动
│   ├── ImageAdapter.kt              # 图片列表适配器
│   └── ui/theme/                    # Compose主题配置
│       ├── Color.kt                 # 颜色定义
│       ├── Theme.kt                 # 主题配置
│       └── Type.kt                  # 字体样式
├── res/
│   ├── layout/                      # 布局文件
│   │   ├── activity_main.xml        # 主界面布局
│   │   ├── activity_image_detail.xml # 详情界面布局
│   │   └── item_image.xml           # 列表项布局
│   ├── drawable/                    # 图片资源
│   │   ├── img1.jpg ~ img10.jpg     # 示例图片
│   │   └── ic_launcher_*.xml        # 应用图标
│   └── values/                      # 资源值
└── AndroidManifest.xml              # 应用清单文件
```

## 🚀 快速开始

### 环境要求
- **Android Studio** - 最新版本
- **JDK** - 11或更高版本
- **Android SDK** - API 24及以上
- **Gradle** - 8.13.0

### 安装步骤

1. **克隆项目**
   ```bash
   git clone [https://github.com/erath-rise/cit-633-image-viewer.git]
   cd ImageViewer
   ```

2. **打开项目**
    - 使用Android Studio打开项目根目录
    - 等待Gradle同步完成

3. **运行应用**
    - 连接Android设备或启动模拟器
    - 点击运行按钮

### 构建配置

项目使用Gradle Kotlin DSL进行构建配置：

- **编译SDK**: 36
- **目标SDK**: 36
- **最低SDK**: 24 (Android 7.0)
- **Java版本**: 11
- **Kotlin版本**: 2.0.21

## 应用界面

### 主界面
- 显示"图片查看器"标题
- 网格布局展示图片缩略图
- 每个图片以卡片形式呈现，带有圆角和阴影效果

### 详情界面
- 全屏显示选中的图片
- 支持ActionBar导航返回
- 图片自适应屏幕尺寸